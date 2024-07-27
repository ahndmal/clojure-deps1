(ns com.andmal.fs
    (:import (java.nio.file Files Path Paths)
             (java.time LocalDate)     
             (java.util.stream IntStream Stream Collectors)
    )
    (:require 
      [clojure.string :as str] 
      [clojure.java.io :as io] 
    )
)

(def root "/home/andrii/Documents")
;(def logFile "comments.log.2023-02-08.0")
;(def logPath (.toPath ( io/file (str root logFile ) ) ) ) 

(def fileLines (Files/readAllLines (Path/of )))

(def lines (IntStream/range 1 100) )

(doseq [x (range 10) ] (prn x) )

(.forEach lines (fn [n] (println n) ) )
