fn main() {
    let s: String = String::from("Hello");

    let t = s.clone(); // let t: String = &s;
    println!("{s}");
}