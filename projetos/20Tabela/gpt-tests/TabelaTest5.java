
package ds;Test cases for the Tabela Java class:

1. Test case for pesquisa() method:
   - Test when the table is empty:
     - Create a Tabela object.
     - Create an Item object.
     - Call pesquisa() method on the table object passing the item object as a parameter.
     - Assert that the return value is 0.

   - Test when the table is not empty and the item is found:
     - Create a Tabela object.
     - Add some Item objects to the table.
     - Create an Item object that exists in the table.
     - Call pesquisa() method on the table object passing the item object as a parameter.
     - Assert that the return value is the index of the item in the table.

   - Test when the table is not empty and the item is not found:
     - Create a Tabela object.
     - Add some Item objects to the table.
     - Create an Item object that does not exist in the table.
     - Call pesquisa() method on the table object passing the item object as a parameter.
     - Assert that the return value is 0.

2. Test case for insere() method:
   - Test when the table is not full:
     - Create a Tabela object.
     - Create an Item object.
     - Call insere() method on the table object passing the item object as a parameter.
     - Assert that the number of items in the table is increased by 1.
     - Assert that the last item in the table is the same as the inserted item.

   - Test when the table is full:
     - Create a Tabela object with the maximum number of items.
     - Create an Item object.
     - Call insere() method on the table object passing the item object as a parameter.
     - Assert that an exception is thrown with the message "Erro: A tabela esta cheia".
     - Assert that the number of items in the table is not changed.

3. Test case for binaria() method:
   - Test when the table is empty:
     - Create a Tabela object.
     - Create an Item object.
     - Call binaria() method on the table object passing the item object as a parameter.
     - Assert that the return value is 0.

   - Test when the table is not empty and the item is found:
     - Create a Tabela object.
     - Add some Item objects to the table.
     - Sort the items in the table in ascending order.
     - Create an Item object that exists in the table.
     - Call binaria() method on the table object passing the item object as a parameter.
     - Assert that the return value is the index of the item in the table.

   - Test when the table is not empty and the item is not found:
     - Create a Tabela object.
     - Add some Item objects to the table.
     - Sort the items in the table in ascending order.
     - Create an Item object that does not exist in the table.
     - Call binaria() method on the table object passing the item object as a parameter.
     - Assert that the return value is 0.