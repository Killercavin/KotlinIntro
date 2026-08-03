fn main() {
    let my_arr = [9, 8, 6, 3, 4, 5];

    println!("{}", my_arr[1]);

    let a: [i32; 5] = [1, 2, 3, 4, 5];
    let b: [i32; 6] = [1, 2, 3, 4, 5];

    println!("{}", a == b);
}