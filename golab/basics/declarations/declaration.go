package main

import "fmt"

const boillingTempInF = 100

func main() {
	var f = boillingTempInF

	var c = (f - 32) * 5 / 9

	fmt.Printf("Boiling point = %dF or %dC", f, c)
}