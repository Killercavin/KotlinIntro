fn main() {
    let x = 5;
    println!("The initial value of x: {x}");

    let x = x + 1;
    println!("The value of x after shadowing: {x}");

    /* new block */
    {
        let x = x + 5;
        println!("The value of x in the block: {x}");
    }

    println!("The value of x again: {x}");
}