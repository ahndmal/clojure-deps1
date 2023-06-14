(ns com.andmal.jira
  (:import 
    (kong.unirest HttpResponse HttpRequest Unirest Header)
    (com.google.gson Gson JsonArray JsonObject )
    (java.util Base64) 
  )
  (:require 
    [clojure.string :as str] )
 )

(println (System/getProperty "java.version"))

(def jiraUrl "http://localhost:9600")
(def restUrl "/rest/api/2/issue/")
(def token 
  (.encodeToString 
    (Base64/getEncoder) (.getBytes ("admin:admin") ) ) )

;(def resp (.header "Authorization" ("Basic "+token ) 
 ;            (.header "Content-Type" "application/json" 
  ;             (Unirest/get 
   ;              (jiraUrl + restUrl) ) ) ) )

;(def respBody (.asString resp) )

(println token)
