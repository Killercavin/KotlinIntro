fn main() {
    let mut x: i32 = 5;

    const A: &str = "this is a constant";

    println!("The value of x before: {x}");
    x = 'r' as i32; // char

    println!("The value of x after: {x}");
    println!("{A}");

    let a: str = "hello";
    println!("{a}");
}