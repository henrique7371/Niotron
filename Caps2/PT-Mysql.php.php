<?php
/*
 * Correção de bug: Variável indefinida: csv
 */

/************************************ CONFIGURAÇÕES ****************************************/
// DETALHES DO BANCO DE DADOS //
$DB_ADDRESS = "localhost";
$DB_USER = "";
$DB_PASS = "";
$DB_NAME = "";

// CONFIGURAÇÕES //
// Este código é algo que você configura no aplicativo para que pessoas aleatórias não possam usá-lo.
$SQLKEY = "cathow";

/************************************ CONFIGURAÇÕES ****************************************/

// Essas configurações são apenas para garantir que os cabeçalhos sejam sempre expirados
header('Cache-Control: no-cache, must-revalidate');

error_log(print_r($_POST, TRUE));

if (isset($_POST['query']) && isset($_POST['key')) { // Verifica se a postagem da tag está presente e se é uma postagem de formulário válida

  // Define o tipo de conteúdo como CSV (definido aqui para permitir acesso a esta página também pelo navegador)
  header('Content-type: text/csv');

  if ($_POST['key'] == $SQLKEY) { // Valida a chave SQL

    $query = urldecode($_POST['query']);
    if (get_magic_quotes_gpc()) { // Verifica se o magic quotes está ativado e, se estiver, remove as barras da consulta
      $query = stripslashes($query);
    }
    $conn = new mysqli($DB_ADDRESS, $DB_USER, $DB_PASS, $DB_NAME); // Conecta ao banco de dados

    if ($conn->connect_error) { // Verifica a conexão
      header("HTTP/1.0 400 Bad Request");
      echo "ERRO: Falha na conexão com o banco de dados: " . $conn->connect_error, E_USER_ERROR; // Relata uma falha na conexão com o banco de dados
    } else {
      $result = $conn->query($query); // Executa a consulta postada
      if ($result === false) {
        header("HTTP/1.0 400 Bad Request"); // Envia um erro de solicitação ruim
        echo "Consulta SQL incorreta: " . $query . " Erro: " . $conn->error, E_USER_ERROR; // Erros se a consulta estiver incorreta e devolve o erro para o cliente
      } else {
        if (strlen(stristr($query, "SELECT")) > 0) { // Verifica se é uma instrução SELECT
          $csv = ''; // Correção de bug: Variável indefinida: csv
          while ($fieldinfo = $result->fetch_field()) {
            $csv .= $fieldinfo->name . ",";
          }
          $csv = rtrim($csv, ",")."\n";
          echo $csv; // Imprime a linha de cabeçalho
          $csv = '';

          $result->data_seek(0);
          while ($row = $result->fetch_assoc()) {
            foreach ($row as $key => $value) {
              $csv .= $value . ",";
            }
            $csv = rtrim($csv, ",")."\n";
          }
          echo $csv; // Imprime todas as linhas de dados
        } else {
          header("HTTP/1.0 201 Rows");
          echo "LINHAS AFETADAS: " . $conn->affected_rows; // Se a consulta for diferente de SELECT, retornará o número de linhas afetadas
        }
      }
      $conn->close(); // Fecha o banco de dados
    }
  } else {
    header("HTTP/1.0 400 Bad Request");
    echo "Requisição Ruim"; // Relata se a chave secreta estiver incorreta
  }
} else {
  header("HTTP/1.0 400 Bad Request");
  echo "Requisição Ruim";
}
?>
