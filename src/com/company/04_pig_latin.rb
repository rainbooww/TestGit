def translate (sent)
    vowels = %w{a e i o u}
    sent.gsub(/(\A|\s)\w+/) do |str|

      #Removes leading and trailing whitespace from str. Returns nil if str was not altered.
            str.strip!
        #use NOT operator to reverse the logical state of when the string contains vowels or starts with 'u' or end with 'q'
        #use loop to move multiple vowels 1 or 2 or 3
        while not vowels.include? str[0] or (str[0] == 'u' and str[-1] == 'q')
            str += str[0]
            str = str[1..-1]
        end
        str  = ' ' + str + 'ay'

    #Returns a copy of str with leading and trailing whitespace removed.
    end.strip
end
