package calculator;

class StringCalculator {

    public int add(String input) {
         if (string.IsNullOrEmpty(input))
         {
             //if numbers empty then return 0
        return 0;
    }
         var delimeters = new List<char>()
                                    {
                                        '\n',',' //numbers separated by commas
                                    };
        
        if (input[0] == '/')
            {
                var customDelimeter = input[2];
                delimeters.Add(customDelimeter);
                input = input.Remove(0,
                                   3);

            }
    }
}
