// grade calculator

fun main(){
    print("Enter your score: ")
    val grade = readln().toInt()
    if (grade >= 0 && grade < 60){
        print("Your grade equals F")
    } else if( grade >= 60 && grade < 70){
        print("Your grade equals D")
    } else if(grade >= 70 && grade < 80){
        print("Your grade equals C")
    } else if(grade >= 80 && grade < 90){
        print("Your grade equals B")
    } else if(grade >= 90 && grade <= 100) {
        print("Your grade equals A")
    } else {
        print("Your grade equals unknown")
    }
}

// when is more clean and can be used idiomatically for this task