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
           var numbers = input.ToCharArray().Where(x => !delimeters.Contains(x)).ToList();

            if (numbers.Any(x => x == '-'))
            {
                StringBuilder stringBuilder= new StringBuilder();
                for (int i = 0;
                     i < numbers.Count;
                     i++)
                {
                    if (numbers[i] == '-')
                    {
                        stringBuilder.Append("-");
                        stringBuilder.Append(numbers[++i]);
                        stringBuilder.Append(", ");
                    }    
    }
                   throw new Exception(string.Format("negative numbers not allowed",stringBuilder.ToString()));
            }
        
}
