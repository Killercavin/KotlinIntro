fn main() {
    let s = "Ritchie";
    let x: &str = &s; // let x: &str = *&s;
    println!("{}", x);

    /**
     * Rust compiler automatically performs dereferencing on the initialization making it pass compilation
     * Unlike C where **var may hide bugs so doing so is wrong
     */
}