(ns com.andmal.jira
  (:import 
    (kong.unirest HttpResponse HttpRequest Unirest Header)
    (java.util Base64) 
  )
  (:require 
    [clojure.string :as str]
    [cheshire.core :as json] 
   )
 )

(def jiraUrl "http://localhost:9600")
(def restUrl "/rest/api/2/issue/")
(def token 
  (.encodeToString 
    (Base64/getEncoder) (.getBytes "admin:admin" ) ) )

(def headers 
  {"Authorization" (str "Basic" token) "Content-Type" "application/json"}
)

(println str "Java Version is " (System/getProperty "java.version"))

(def fullUrl (str jiraUrl restUrl) )

(defn get-isse [url token iKey] (
  (let [req ( Unirest/get (str url iKey)) ] )
  ;(def req1 (.headers req headers) )
  ;(def req2 (.basicAuth req1 "admin" "admin") )
  ;(def resp (.asString req2) )
  ;(def jsonIssue (json/parse-string (.getBody resp) ) )
  ) 
)


(get-isse fullUrl token "AAA-2")




