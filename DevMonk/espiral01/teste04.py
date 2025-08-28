
amigos = []

for i in range(3):
    nome = input(f"Digite o nome do seu amigo {i + 1}: ")
    amigos.append(nome)

print("\nSeus melhores amigos são:")
for i, amigo in enumerate(amigos, 1):
    print(f"{i}. {amigo}")