(ns com.andmal.strs
  )

(def pname "Andrii")

(def caped (clojure.string/capitalize "hello"))

(println (type ( str "a" "b" "c" )  ) )
(println caped)
