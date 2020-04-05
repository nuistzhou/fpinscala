object Curry{
    def curry[A, B, C](f: (A, B) => C) : A => (B => C) = {
        a:A => f(a,b) = {
            b:B => f(a,b)
        }
    }
}