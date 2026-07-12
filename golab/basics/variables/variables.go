package main

import (
	"fmt"
)

var s0 string // global scope

func main() {
	s0 = "Variable from global scope"

	// function block scope
	s := "Variable from function block scope"

	fmt.Println(s0)
	fmt.Println(s)
}
