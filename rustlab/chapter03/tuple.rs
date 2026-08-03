fn main() {
    let my_tuple: (i32, char, bool, &str) = (5, 'a', true, "string text");
    
    let (a, b, c, d) = my_tuple;

    println!("{a}");
    println!("{b}");
    println!("{c}");
    println!("{d}");

    println!("{0}", my_tuple.0);
}