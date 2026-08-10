fn main() {
    let result: u32 = add(4, 5);
    println!("The result is {result}");
}

fn add(i: i32, j: i32) -> i32 {
    return i + j;
}