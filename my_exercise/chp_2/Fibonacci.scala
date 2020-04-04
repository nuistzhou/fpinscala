object Fibonacci{
    def fib_cal(n: Int): Int = {
        if (n == 1) 0
        else if (n == 2) 1
        else fib_cal(n - 2) + fib_cal(n - 1)
    }

    def fib(n: Int) = {
        val msg = "The %d th Fibonacci number is %d"
        msg.format(n, fib_cal(n))
    }

    def main(args: Array[String]): Unit = {
        println(fib(20))
    }
}