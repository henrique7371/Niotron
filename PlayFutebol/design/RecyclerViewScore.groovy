{
    "name": "recycler_score",
    "metadata-version": 1,
    "extension_version": 5,
    "author": "Henrique Brito",
    "platforms": [
        "creator.kodular.io"
    ],
    "keys": [],
    "components": [
        {
            "id": "mainVertical",
            "type": "com.google.appinventor.components.runtime.VerticalArrangement",
            "properties": {
                "Width": -2,
                "AlignHorizontal": 3
            },
            "components": [
                {
                    "id": "cardPrincipal",
                    "type": "com.google.appinventor.components.runtime.NiotronCardView",
                    "properties": {
                        "WidthPercent": 95,
                        "AlignHorizontal": 3,
                        "MarginBottom": 10,
                        "MarginTop": 15,
                        "Radius": 5
                    },
                    "components": [
                        {
                            "id": "labelCompeticao",
                            "type": "com.google.appinventor.components.runtime.Label",
                            "properties": {
                                "Width": -2,
                                "TextAlignment": 1,
                                "FontBold": true,
                                "FontSize": 16,
                                "Height": 30
                            }
                        },
                        {
                            "id": "horizontalPlacar",
                            "type": "com.google.appinventor.components.runtime.HorizontalArrangement",
                            "properties": {
                                "Width": -2,
                                "AlignHorizontal": 3,
                                "AlignVertical": 2
                            },
                            "components": [
                                {
                                    "id": "verticalTime1",
                                    "type": "com.google.appinventor.components.runtime.VerticalArrangement",
                                    "properties": {
                                        "AlignHorizontal": 3,
                                        "Width": -2
                                    },
                                    "components": [
                                        {
                                            "id": "imgTime1",
                                            "type": "com.google.appinventor.components.runtime.Image",
                                            "properties": {
                                                "Height": 40,
                                                "Width": 40
                                            }
                                        },
                                        {
                                            "id": "labelNomeTime1",
                                            "type": "com.google.appinventor.components.runtime.Label",
                                            "properties": {
                                                "TextAlignment": 1
                                            }
                                        }
                                    ]
                                },
                                {
                                    "id": "labelPlacarTime1",
                                    "type": "com.google.appinventor.components.runtime.Label",
                                    "properties": {
                                        "FontSize": 25,
                                        "FontBold": true
                                    }
                                },
                                {
                                    "id": "x",
                                    "type": "com.google.appinventor.components.runtime.Label",
                                    "properties": {
                                        "FontSize": 20,
                                        "FontBold": true,
                                        "Text": "X"
                                    }
                                },
                                {
                                    "id": "labelPlacarTime2",
                                    "type": "com.google.appinventor.components.runtime.Label",
                                    "properties": {
                                        "FontSize": 25,
                                        "FontBold": true
                                    }
                                },
                                {
                                    "id": "verticalTime2",
                                    "type": "com.google.appinventor.components.runtime.VerticalArrangement",
                                    "properties": {
                                        "AlignHorizontal": 3,
                                        "Width": -2
                                    },
                                    "components": [
                                        {
                                            "id": "imgTime2",
                                            "type": "com.google.appinventor.components.runtime.Image",
                                            "properties": {
                                                "Height": 40,
                                                "Width": 40
                                            }
                                        },
                                        {
                                            "id": "labelNomeTime2",
                                            "type": "com.google.appinventor.components.runtime.Label",
                                            "properties": {
                                                "TextAlignment": 1
                                            }
                                        }
                                    ]
                                }
                            ]
                        },
                        {
                            "id": "labeltempojogo",
                            "type": "com.google.appinventor.components.runtime.Label",
                            "properties": {
                                "Text": "0MIN",
                                "Width": -2,
                                "TextAlignment": 1
                            }
                        },
                        {
                            "id": "labeldiajogo",
                            "type": "com.google.appinventor.components.runtime.Label",
                            "properties": {
                                "Width": -2,
                                "TextAlignment": 1
                            }
                        },
                        {
                            "id": "botaoAssistir",
                            "type": "com.google.appinventor.components.runtime.Button",
                            "properties": {
                                "Text": "Assistir",
                                "WidthPercent": 50,
                                "BackgroundColor": -14474453,
                                "TextColor": -332841
                            }
                        }
                    ]
                }
            ]
        }
    ]
}
