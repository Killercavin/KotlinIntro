fn main() {
    let mut count: i32 = 0;

    let result = loop {
        count += 1;

        if count == 10 {
            break count;
        }
    };

    println!("The count is {result}");
}