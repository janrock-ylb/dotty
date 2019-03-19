import scala.quoted._

object Lib {
  inline def sum(inline args: Int*): Int = ${ impl(args: _*) }
  def impl(args: Int*): Expr[Int] = args.sum.toExpr
}
