(ns com.andmal.funcs
  (:import [java.time LocalDate] )
  )


(defn hello [url token]  (println url ) )

(hello "/rest/" "token")
