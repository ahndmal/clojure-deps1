(ns com.andmal.funcs
  (:import [java.time LocalDate] )
  )

;; anonymous
(#(println %1 %2) "Hello " "Clojure")

(fn* [arg1 arg2] (clojure.core/println arg1 arg2)) ; takes 2 args

(defn hello [url token]  (println url ) )

(hello "/rest/" "token")
