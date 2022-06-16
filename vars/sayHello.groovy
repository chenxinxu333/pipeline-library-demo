#!/usr/bin/env groovy

public class GlobalVars {
   public static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
}
def call(String name = 'human') {
  echo "Hello, ${name}."
  echo "11111111,${GlobalVars.foo}."
}

