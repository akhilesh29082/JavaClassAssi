// Data types are divided into two groups:

// Primitive data types - includes byte, short, int, long, float, double, boolean and char
// Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)



// byte	Stores whole numbers from -128 to 127
// short	Stores whole numbers from -32,768 to 32,767
// int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
// boolean	Stores true or false values
// char	Stores a single character/letter or ASCII values




// String - stores text, such as "Hello". String values are surrounded by double quotes 'h'
// int - stores integers (whole numbers), without decimals, such as 123 or -123
// float - stores floating point numbers, with decimals, such as 19.99 or -19.99
// char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
// boolean - stores values with two states: true or false




public class DataTypes
{
    public static void main(String[] args)
    {
        System.out.println("Hello");

        String name = "Harshini";
        System.out.println("name:"+name);


        float dec = 6.2f;
        System.out.println(dec);

        int myNum = 95;
        myNum =60;
        System.out.println(myNum);  

        char letter = 'H';
        System.out.println(letter);

        final int Num = 15;
        System.out.println(Num);
    }
}
