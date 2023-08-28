from bs4 import BeautifulSoup as bs
import re

html = open("index.html")

soup = bs(html, 'html.parser')
divs = soup.findAll(attrs={'class':'coverage_percentage'})
covs = soup.findAll(attrs={'class':'coverage_legend'})

prj="24Grafo"
clazz="ds.Grafo"

print divs
print covs

print "PRJ;CLASSE;Cobertos;Gerados;Cobertura;Mortos;Total;Escore"

print prj,";",
print clazz,";",
print covs[2].text.split("/")[0],";",
print covs[2].text.split("/")[1],";",
print divs[0].text,";", 

print covs[3].text.split("/")[0],";",
print covs[3].text.split("/")[1],";",
print divs[1].text

