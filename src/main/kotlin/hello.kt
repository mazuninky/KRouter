fun main(args: Array<String>) {
    val router = buildRouter {
        "/v1/kek" to {
            println("Kek")
        }
    }

    router.route("foo/bar")
    router.route("/v1/kek")
}
