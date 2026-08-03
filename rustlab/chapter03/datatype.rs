fn main() {
    let x: u32 = 5;
    // x = -5; // expects unsigned -> this won't work
    println!("{x}");

    let t = true;
    let f: bool = false;
    println!("True: {t}\nFalse: {f}");

    let emoji: char = '🦀';
    println!("{emoji}");
}