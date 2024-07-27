(ns com.andmal.times
  (:require [java-time.api :as t]))
  (:import (java.time LocalDateTime LocalDate Year  DayOfWeek)))

(def day (.getDayOfWeek (LocalDateTime/now)) )
(println (.toString day))

(def year Year)
(println year)

;;; using clojure.java-time API

(defn time-str
  "Returns a string representation of a datetime in the local time zone."
  [instant]
  (t/format
    (t/with-zone (t/formatter "hh:mm a") (t/zone-id))
    instant))

(defn run [opts]
  (println "Hello world, the time is" (time-str (t/instant))))
