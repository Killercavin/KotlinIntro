package main

import "fmt"

func main() {
	i := 5
	p := &i // reference of the variable i in the heap memory
	fmt.Println(p)
	fmt.Println(*p)

	fmt.Println(f() == f(), f() == nil)
	fmt.Println(f())
}

func f() *int {
	v := 1
	return &v
}