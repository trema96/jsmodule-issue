package example

@JsModule("abort-controller")
external class AbortController {
	val signal: dynamic
	fun abort(): Unit
}

@JsExport
fun printAbortController() {
	println(AbortController())
}