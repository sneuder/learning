def main():
  tries = 1
  winner = False
  number_to_guess = 100

  while not winner and tries > 0:
    number_user = int(input("\nguess the number: "))

    if (number_to_guess is not number_user):
      print("that is not the number")
      tries -= 1

      if (tries == 0):
        print(f"\nyou lost, the number was {number_to_guess}")

      continue
    
    winner = not winner
    print(f"\nyou won, the number was {number_to_guess}")

main()