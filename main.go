package main

import (
    "net/http"

    "github.com/gin-gonic/gin"
)

type card struct {
	ID string `json: "id"`
	Number int64 `json: "number"`
	Bank string `json: "bank"`
	ExpDate string `json: "exp_date"`
}

var cards = []card {

	{ID: "1234", Number: 5341, Bank: "Galicia", ExpDate: "12/26"},
}

func main () {
	router := gin.Default()
	router.GET("/cards", getCards)

	router.Run("localhost:8080")
}

func getCards(c *gin.Context)  {

	c.IndentedJSON(http.StatusOK, cards)
	
}