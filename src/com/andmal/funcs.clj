(ns com.andmal.funcs
  (:import [java.time LocalDate] )
  )

;; anonymous
(#(println %1 %2) "Hello " "Clojure")

(fn* [arg1 arg2] (clojure.core/println arg1 arg2)) ; takes 2 args

(defn hello [url token]  (println url ) )

(hello "/rest/" "token")

;;;;;;; filtering

(def bands [
    {:name "Brown Beaters"   :genre :rock}
    {:name "Sunday Sunshine" :genre :blues}
    {:name "Foolish Beaters" :genre :rock}
    {:name "Monday Blues"    :genre :blues}
    {:name "Friday Fewer"    :genre :blues}
    {:name "Saturday Stars"  :genre :jazz}
    {:name "Sunday Brunch"   :genre :jazz}
])

(def rock-bands
    (filter
        (fn [band] (= :rock (:genre band)))
        bands))

(def rock-bands2 (filter #(= :rock (:genre %)) bands))
        
; Functions Returning Functions and Closures

(defn adder [x]
  (fn [a] (+ x a)))

(def add-five (adder 5))

(add-five 100)
;; => 105
