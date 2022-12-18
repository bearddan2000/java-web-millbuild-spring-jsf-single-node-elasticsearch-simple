import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
ivy"org.springframework.boot:spring-boot-starter-web:",
ivy"org.springframework.boot:spring-boot-starter-data-elasticsearch:",
ivy"org.projectlombok:lombok:1.18.8",
ivy"org.joinfaces:primefaces-spring-boot-starter:4.3.12",
ivy"javax.enterprise:cdi-api:1.2"
  )
}
