import csv
from collections import defaultdict

# Criar um dicionário para armazenar as somas dos valores de cobertura e escore por temperatura
temperatura_somas = defaultdict(lambda: {'Cobertura': 0, 'Escore': 0, 'Contagem': 0})

# Ler o arquivo CSV e calcular as somas de cobertura e escore por temperatura
with open('reports/all.csv', newline='') as csvfile:
    reader = csv.DictReader(csvfile, delimiter=';')
    for row in reader:
        temperatura = float(row['Temperature'])
        cobertura = float(row['Cobertura'].rstrip('%')) / 100  # Converter a porcentagem para um valor decimal
        escore = float(row['Escore'].rstrip('%')) / 100

        # Somar os valores de cobertura e escore para cada temperatura
        temperatura_somas[temperatura]['Cobertura'] += cobertura
        temperatura_somas[temperatura]['Escore'] += escore
        temperatura_somas[temperatura]['Contagem'] += 1

# Calcular as médias de cobertura e escore para cada temperatura
for temperatura, valores in temperatura_somas.items():
    media_cobertura = valores['Cobertura'] / valores['Contagem']
    media_escore = valores['Escore'] / valores['Contagem']
    print(f"Temperatura: {temperatura:.1f} | Média Cobertura: {media_cobertura:.2f} | Média Escore: {media_escore:.2f}")