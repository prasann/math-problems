#!/usr/local/bin/ruby -w

def iterate(actual_str)
  possible_substr =""
  actual_str.each_char do |char|
    if(char == possible_substr[0] and 
      actual_str.length % possible_substr.length == 0)
        no_of_times = actual_str.length / possible_substr.length
        gotIt = (possible_substr * no_of_times)
        p "Repeating pattern is #{possible_substr}" if(gotIt == actual_str)
        return      
    end
    possible_substr << char
  end
end

iterate('abab');
