# method that returns first name when full name is written
def get_first_name(name):
    return name.split(' ')[0]


def get_last_name(name):
    return name.split(' ')[1]


# main method that returns first name and last name seperately when full name is inputted using methods above
def main():
    name = input('Enter your name: ')
    first_name = get_first_name(name)
    last_name = get_last_name(name)
    print('Your first name is: ' + first_name)
    print('Your last name is: ' + last_name)


main()
