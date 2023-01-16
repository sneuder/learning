list_die = [
  ['-', '-', '-'],
  ['-', '-', '-'],
  ['-', '-', '-']
]

coords = {
  1: [[1, 1]],
  2: [[0, 0], [2, 2]],
  3: [[0,0],[1,1],[2,2]],
}

def show_die():
  for period in list_die:
    print(" ".join(period))


def throw_die():
  number = int(input("type a number: "))

  for coord in coords[number]:
    list_die[coord[0]][coord[1]] = '*'

  show_die()


throw_die()