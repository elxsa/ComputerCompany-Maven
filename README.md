This group project was made using Java (Maven), CSS and it captures a production management system for a computer assembly company, offering clients three types of services: purchasing pre-assembled electronic systems, building desktop PCs from provided parts, and the option to send a product for servicing. Each team member performed tests for the implemented code, captured in a class named after each of them, preceded by the word 'Test' and had to incorporate a UML diagram (individually), corresponding to the system's structure.

![gantt](https://github.com/elxsa/ComputerCompany-Maven/assets/146994240/7ab4821c-7414-46f7-9336-b0d47d9e4559)

The diagram, made using Visual Paradigm, systematically outlines the flow of activities and responsibilities within the computer assembly company, highlighting the roles of managers, employees, and customers, as well as the process of handling orders and promotions.

![Screenshot_42](https://github.com/elxsa/ComputerCompany-Maven/assets/146994240/72fea27e-1c5f-4c2c-b59f-54c12e979322)

(IDE used to develop application and run tests: IntelliJ IDEA)

Additional info: 
- There is a manager who can add new employees and view employees. Employees can be part of two categories: juniors and seniors. Only senior employees can add new products and parts to the system. Both categories can fulfill orders and, as such, can change the status of an order or a service request.
- Customers can view products without an account, but they need to create an account and log in to place an order. They can place two types of orders: purchase or service. In the first case, they will only be able to enter items from the catalog (parts or pre-assembled systems). If they add pre-assembled parts, they will be charged an additional 100 RON at the end. For service, they will submit a request containing authentication data, a description of the problem, and a date chosen by the customer.
- Electronic systems can be in the categories: desktop PCs, laptop PCs, printers, and peripherals. Parts will be placed in the same category, called components. The catalog accessible to customers will be accessed by choosing one of the aforementioned categories.
- All offered products will have an associated price and a description. The description will contain the type of component, a short presentation of up to 100 words, and a score given by critics (1-5 stars).
- There can be promotions in the system, proposed by the manager, who can also delete them. These will be in a separate category, and when they are added to the cart, the items included in the promotion will be added, along with a special item named promotion, with a negative price of 10% of the value of the products.
