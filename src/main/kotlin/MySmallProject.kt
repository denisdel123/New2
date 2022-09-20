import java.util.Scanner

fun main() {
    val objectS = Scanner(System.`in`)
    while (true) {
        print("Start - 1 Stop - 2: ")
        val start = objectS.nextInt()
        if (start == 1) {

            println("Enter - 1 (accrual)\nEnter - 2(calculator)\nEnter - 3(currencyConverter)\nEnter - 4(arrayCreation)\nEnter - 5(fibonacciNumbers)\nEnter - 6(fibonacciArray)" +
                    "\nEnter - 7(palindromeArray)\nEnter - 8(timeConverter)")
            val number = objectS.nextInt()




            if (number == 1) {
                while (true) {
                    print("Enter amount: ")
                    val amount1 = objectS.nextFloat()
                    print("Enter number of months: ")
                    val months1 = objectS.nextFloat()
                    print("Enter %: ")
                    val percentage1 = objectS.nextFloat() / 100
                    accrual(amount = amount1, months = months1, percentage = percentage1)

                    print("Proceed? 1 - yes 2 - no: ")
                    val stop = objectS.nextInt()
                    if (stop != 1) {
                        break
                    }
                }


            }




            if (number == 2){
                while (true) {
                    print("Input number1: ")
                    val number1 = objectS.nextInt()
                    print("Input action: ")
                    val action = objectS.next()
                    print("Input number2: ")
                    val number2 = objectS.nextInt()
                    calculator(number1, action, number2)

                    print("Proceed? 1 - yes 2 - no: ")
                    val stop = objectS.nextInt()
                    if (stop != 1) {
                        break
                    }
                }

            }




            if (number == 3){
                while (true) {
                    val objectS = Scanner(System.`in`)
                    print("Enter amount: ")
                    val amount = objectS.nextInt()
                    println("What currency:\nr - RUB\nu - USD\ne - EUR\ng - GBP\nc - CHF\nj - JPY")
                    val currency = objectS.next()
                    println("What currency to change:\nr - RUB\nu - USD\ne - EUR\ng - GBP\nc - CHF\nj - JPY")
                    val forCurrency = objectS.next()
                    currencyConverter(amount, currency, forCurrency)

                    print("Proceed? 1 - yes 2 - no: ")
                    val stop = objectS.nextInt()
                    if (stop != 1) {
                        break
                    }
                }



            }






            if (number == 4) {
                while (true) {
                    print("Enter the size of the array1: ")
                    val sizeArray: Int = objectS.nextInt()
                    val massiv1 = Array(sizeArray, { 0 })
                    for (number in 0..sizeArray - 1) {
                        print("Enter number $number: ")
                        val numbersArray = objectS.nextInt()
                        massiv1[number] = numbersArray
                    }

                    arrayCreation(massiv1)

                    print("Proceed? 1 - yes 2 - no: ")
                    val stop = objectS.nextInt()
                    if (stop != 1) {
                        break
                    }
                }
            }



            if (number == 5){
                while (true){
                    val objectS = Scanner(System.`in`)
                    print("Enter number: ")
                    val number = objectS.nextInt()

                    fibonacciNumbers(number)

                    print("\nProceed? 1 - yes 2 - no: ")
                    val stop = objectS.nextInt()
                    if (stop != 1) {
                        break
                    }
                }
            }





            if (number == 6){
                while (true){
                    print("Enter the size of the array1: ")
                    val sizeArray = objectS.nextInt()
                    val massiv =Array(sizeArray,{0})

                    fibonacciArray(massiv,sizeArray)

                    print("\nProceed? 1 - yes 2 - no: ")
                    val stop = objectS.nextInt()
                    if (stop != 1) {
                        break
                    }
                }
            }





            if (number == 7){
                while (true) {
                    print("Enter the size of the array: ")
                    val sizeArray: Int = objectS.nextInt()
                    val massiv = Array(sizeArray, { 0 })
                    for (number in 0..sizeArray - 1) {
                        print("Enter number $number: ")
                        val numberArray: Int = objectS.nextInt()
                        massiv[number] = numberArray
                    }
                    palindromeArray(sizeArray, massiv)

                    print("\nProceed? 1 - yes 2 - no: ")
                    val stop = objectS.nextInt()
                    if (stop != 1) {
                        break
                    }
                }

            }



            if (number == 8){
                while (true){
                    print("How many seconds to convert: ")
                    val seconds = objectS.nextInt()

                    timeConverter(seconds)

                    print("\nProceed? 1 - yes 2 - no: ")
                    val stop = objectS.nextInt()
                    if (stop != 1) {
                        break
                    }
                }
            }









        }
        else if (start == 2){
            break
        }


    }
}



fun accrual(amount:Float, months:Float,percentage:Float) {
    var amounts = amount
    for (z in 1..months.toInt()) {
        amounts += percentage + amount
    }
    println("$amounts")
}



fun calculator(number1:Int,action:String,number2: Int){
    if (action == "-") {
        println(number1 - number2)
    } else if (action == "+") {
        println(number1 + number2)
    } else if (action == "*") {
        println(number1 * number2)
    } else if (action == "/") {
        println(number1 / number2)
    } else if (action == "%") {
        println(number1 % number2)
    } else if (action == "<" || action == ">" || action == "=") {
        if (number1 < number2) {
            println("$number1 < $number2")
        } else if (number1 > number2) {
            println("$number1 > $number2")
        } else if (number1 == number2) {
            println("$number1 = $number2")
        }
    } else {
        println("Incorrect data")
    }
}



fun currencyConverter(amount:Int,currency:String,forCurrency:String){
    if (currency == "r" && forCurrency == "u") {
        println("${amount * 30} USD")
    } else if (currency == "r" && forCurrency == "e") {
        println("${amount * 31} EUR")
    } else if (currency == "r" && forCurrency == "g") {
        println("${amount * 32} GBP")
    } else if (currency == "r" && forCurrency == "c") {
        println("${amount * 33} CHF")
    } else if (currency == "r" && forCurrency == "j") {
        println("${amount * 34} JPY")
    } else if (currency == "u" && forCurrency == "r") {
        println("${amount * 35} RUB")
    } else if (currency == "u" && forCurrency == "e") {
        println("${amount * 36} EUR")
    } else if (currency == "u" && forCurrency == "g") {
        println("${amount * 37} GBP")
    } else if (currency == "u" && forCurrency == "c") {
        println("${amount * 38} CHF")
    } else if (currency == "u" && forCurrency == "j") {
        println("${amount * 39} JPY")
    } else if (currency == "e" && forCurrency == "r") {
        println("${amount * 40} RUB")
    } else if (currency == "e" && forCurrency == "u") {
        println("${amount * 41} USD")
    } else if (currency == "e" && forCurrency == "g") {
        println("${amount * 42} GBP")
    } else if (currency == "e" && forCurrency == "c") {
        println("${amount * 43} CHF")
    } else if (currency == "e" && forCurrency == "j") {
        println("${amount * 44} JPY")
    } else if (currency == "g" && forCurrency == "r") {
        println("${amount * 45} RUB")
    } else if (currency == "g" && forCurrency == "u") {
        println("${amount * 46} USD")
    } else if (currency == "g" && forCurrency == "e") {
        println("${amount * 47} EUR")
    } else if (currency == "g" && forCurrency == "c") {
        println("${amount * 48} CHF")
    } else if (currency == "g" && forCurrency == "j") {
        println("${amount * 49} JPY")
    } else if (currency == "c" && forCurrency == "r") {
        println("${amount * 50} RUB")
    } else if (currency == "c" && forCurrency == "u") {
        println("${amount * 51} USD")
    } else if (currency == "c" && forCurrency == "e") {
        println("${amount * 52} EUR")
    } else if (currency == "c" && forCurrency == "g") {
        println("${amount * 53} GBP")
    } else if (currency == "c" && forCurrency == "j") {
        println("${amount * 54} JPY")
    } else if (currency == "j" && forCurrency == "r") {
        println("${amount * 55} RUB")
    } else if (currency == "j" && forCurrency == "u") {
        println("${amount * 56} USD")
    } else if (currency == "j" && forCurrency == "e") {
        println("${amount * 57} EUR")
    } else if (currency == "j" && forCurrency == "g") {
        println("${amount * 58} GBP")
    } else if (currency == "j" && forCurrency == "c") {
        println("${amount * 59} CHF")
    }
}




fun arrayCreation(arr:Array<Int>){
    for (massiv in arr) {
        print("$massiv ")
    }

    println()
    var i = 0
    for (massiV in arr) {
        arr[i] = 0
        if (massiV % 2 == 1) {
            print("0 ")
        } else {
            print("$massiV ")
        }

        i++

    }
    println()
}


fun fibonacciNumbers(number:Int){

    var i = 1
    var x = 0
    var z = 1
    print("$x ")
    while (z < number) {
        z++
        i += x
        print("$i")
        z++
        if (z > number) {
            break
        }
        x += i
        print(" $x ")


    }
}



fun fibonacciArray(massiv:Array<Int>, sizeArray:Int){
    var number1:Int = 0
    var number2:Int = 1
    var count = 0
    massiv[count] = number2
    count++
    for (z in 0..sizeArray){
        number1+=number2
        massiv[count] = number1
        number2+=number1
        count++
        if (count == massiv.size){
            break
        }
        massiv[count] = number2
        count++
        if (count == massiv.size){
            break
        }
    }
    for (x in massiv){
        print("$x ")
    }
}



fun palindromeArray(sizeArray: Int, massiv: Array<Int>){
    var lenght = 0
    var lenghtM = massiv.size
    for (z in massiv){
        var count = 0
        var c = 0
        for (x in massiv){

            count++
            if (count == lenghtM){
                if (z == x){
                    lenght++
                }

                else {
                    c++
                }
                if (lenght == massiv.size){
                    print("Palindrom")
                    println()
                }

            }
            else if (c == 1){
                print("no palindrom ")
                println()
                return
            }
        }
        lenghtM--
    }
}



fun timeConverter(seconds:Int){
    val year = seconds / 86400 / 30 / 12
    val remainder = seconds % (86400 * 30 * 12)
    val month = remainder / 86400 / 30
    val remainderMonths = remainder % (86400 * 30)
    val day = remainderMonths / 86400
    val remainderDays = remainderMonths % 86400
    val hour = remainderDays / 3600
    val remainderClock = remainderDays % 3600
    val minute = remainderClock / 60
    val remainderMinutes = remainderClock % 60
    val yearS = year % 10
    val monthS = month % 10
    val dayS = day % 10
    val hourS = hour % 10
    val minuteS = minute % 10
    val secondS = remainderClock % 10
    if (yearS == 1) {
        println("$year год (year)")
    } else if (yearS > 1 && yearS < 5) {
        println("$year года (years)")
    } else {
        println("$year лет (years)")
    }
    if (monthS == 1) {
        println("$month месяц (month)")
    } else if (monthS > 1 && monthS < 5) {
        println("$month месяца (months)")
    } else {
        println("$month месяцев (months)")
    }
    if (dayS == 1) {
        println("$day день (day)")
    } else if (dayS > 1 && dayS < 5) {
        println("$day дня (days)")
    } else {
        println("$day дней (days)")
    }
    if (hourS == 1) {
        println("$hour  (hour)")
    } else if (hourS > 1 && hourS < 5) {
        println("$hour часа (hours)")
    } else {
        println("$hour часов (hoers)")
    }
    if (minuteS == 1) {
        println("$minute минута (minutes)")
    } else if (minuteS > 1 && minuteS < 5) {
        println("$minute минуты(minutes)")
    } else {
        println("$minute минут(minutes)")
    }
    if (remainderMinutes == 1) {
        println("$remainderMinutes секунад (second)")
    } else if (remainderMinutes > 1 && remainderMinutes < 5) {
        println("$remainderMinutes секунды (seconds)")
    } else {
        println("$remainderMinutes секунд (seconds)")
    }
}