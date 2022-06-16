#!/usr/bin/env groovy

class GlobalVars1 {
   static String foo1 = "bar1"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
}
def call() {
  echo "Hello"
  echo "11111111,${GlobalVars.foo}."
}

