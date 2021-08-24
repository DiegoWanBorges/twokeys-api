
    create table tb_accounts_receivable (
       document bigint not null,
        parcel varchar(255) not null,
        dueDate date,
        issueDate date,
        value double precision,
        client_id bigint,
        form_payment_id varchar(255),
        payment_plan_id bigint,
        seller_id bigint,
        primary key (document, parcel)
    ) engine=InnoDB;

    create table tb_city (
       id bigint not null,
        name varchar(255),
        state varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_client (
       id bigint not null,
        cep varchar(255),
        clientType integer,
        cpfCnpj varchar(255),
        creditLimit double precision,
        deliveryNote varchar(255),
        district varchar(255),
        email varchar(255),
        enable bit not null,
        fantasyName varchar(255),
        fixedPhone varchar(255),
        generalNote varchar(255),
        lastBuy date,
        mobilePhone varchar(255),
        name varchar(255),
        number varchar(255),
        specialPrice bit not null,
        street varchar(255),
        validateFinancialBlock bit not null,
        city_id bigint,
        formPayment_id varchar(255),
        lineBusiness_id bigint,
        paymentPlan_id bigint,
        seller_id bigint,
        square_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table tb_department (
       id bigint not null,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_form_payment (
       id varchar(255) not null,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_line_business (
       id bigint not null,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_order (
       id bigint not null auto_increment,
        date date,
        integrationDate date,
        mobileId bigint,
        obsGeral varchar(255),
        orderStatus integer,
        orderType integer,
        client_id bigint,
        form_payment_id varchar(255),
        payment_plan_id bigint,
        seller_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table tb_order_item (
       cost double precision,
        discountPolicyId bigint,
        discountPolicyObs varchar(255),
        orderItemStatus integer,
        quantity double precision,
        quantityGranted double precision,
        salePrice double precision,
        standardPrice double precision,
        totalCommission double precision,
        totalCost double precision,
        totalDiscount double precision,
        totalItem double precision,
        product_id bigint not null,
        order_id bigint not null,
        unity_id varchar(255),
        primary key (order_id, product_id)
    ) engine=InnoDB;

    create table tb_packaging (
       barCode varchar(255),
        conversionFactor double precision,
        description varchar(255),
        grossWeight double precision,
        netWeight double precision,
        unity_id varchar(255) not null,
        product_id bigint not null,
        primary key (product_id, unity_id)
    ) engine=InnoDB;

    create table tb_parameter (
       id bigint not null,
        company varchar(255),
        financialBlockClientOverdue bit not null,
        financialToleranceOverdue integer,
        financialValidateCreditLimit bit not null,
        screenNameType integer,
        screenNumberType integer,
        sellBelowCost bit not null,
        primary key (id)
    ) engine=InnoDB;

    create table tb_payment_plan (
       id bigint not null,
        averageTime integer,
        financialRate double precision,
        firstInterval integer,
        name varchar(255),
        parcelsInterval integer,
        parcelsNumber integer,
        primary key (id)
    ) engine=InnoDB;

    create table tb_product (
       id bigint not null,
        averageCost double precision,
        barCode varchar(255),
        code varchar(255),
        commission double precision,
        description varchar(255),
        enable bit not null,
        grossWeight double precision,
        lastEntryCost double precision,
        maxMargin double precision,
        minMargin double precision,
        minPrice double precision,
        netWeight double precision,
        salePrice double precision,
        stockBalance double precision,
        department_id bigint,
        section_id bigint,
        unity_id varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_quantity_discount (
       id bigint not null,
        authorizedPrice double precision,
        endDate date,
        endQuantity double precision,
        obs varchar(255),
        startDate date,
        startQuantity double precision,
        product_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table tb_role (
       id bigint not null auto_increment,
        authority varchar(255),
        description varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_sales_authorization (
       id bigint not null,
        authorizedPrice double precision,
        endDate date,
        obs varchar(255),
        startDate date,
        client_id bigint,
        product_id bigint,
        seller_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table tb_section (
       id bigint not null,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_seller (
       id bigint not null,
        commission double precision,
        enable bit not null,
        lastConection datetime,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_square (
       id bigint not null,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_unity (
       id varchar(255) not null,
        description varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_user (
       id bigint not null auto_increment,
        login varchar(255),
        name varchar(255),
        password varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_user_role (
       user_id bigint not null,
        role_id bigint not null,
        primary key (user_id, role_id)
    ) engine=InnoDB;

    alter table tb_user 
       add constraint UK_qht682qvopcx5f41dc2rbs5jf unique (login);

    alter table tb_accounts_receivable 
       add constraint FKo82otpmq6f56m1yfv8cfh54no 
       foreign key (client_id) 
       references tb_client (id);

    alter table tb_accounts_receivable 
       add constraint FKkule118mbwb89hfxn15lyt1pf 
       foreign key (form_payment_id) 
       references tb_form_payment (id);

    alter table tb_accounts_receivable 
       add constraint FKbysksym9o6kfjqbvdg483g1yy 
       foreign key (payment_plan_id) 
       references tb_payment_plan (id);

    alter table tb_accounts_receivable 
       add constraint FKtqwhyugem41k39gc981gqxy1o 
       foreign key (seller_id) 
       references tb_seller (id);

    alter table tb_client 
       add constraint FK26iqvaig0po6a1m4sq5gc1g41 
       foreign key (city_id) 
       references tb_city (id);

    alter table tb_client 
       add constraint FKa9h4ewkrj5r7maoy8wasjqb0w 
       foreign key (formPayment_id) 
       references tb_form_payment (id);

    alter table tb_client 
       add constraint FKabeu32nv7cokkmerwgmwej6qv 
       foreign key (lineBusiness_id) 
       references tb_line_business (id);

    alter table tb_client 
       add constraint FKqi4ey9tm39u636br718c5l33y 
       foreign key (paymentPlan_id) 
       references tb_payment_plan (id);

    alter table tb_client 
       add constraint FKnyl35vff1s0rmjd7647tlx29c 
       foreign key (seller_id) 
       references tb_seller (id);

    alter table tb_client 
       add constraint FKbmgh093ln8ftb6844ihlar3fv 
       foreign key (square_id) 
       references tb_square (id);

    alter table tb_order 
       add constraint FK7c9of0p9ogx0w8sfrebt4n9kk 
       foreign key (client_id) 
       references tb_client (id);

    alter table tb_order 
       add constraint FKo9c0vnyg8mobeymcjl611o6vp 
       foreign key (form_payment_id) 
       references tb_form_payment (id);

    alter table tb_order 
       add constraint FKo2x1twv6og1knt61f5jke6bj6 
       foreign key (payment_plan_id) 
       references tb_payment_plan (id);

    alter table tb_order 
       add constraint FK2re4duoe9drrox6vr1y6i4y4e 
       foreign key (seller_id) 
       references tb_seller (id);

    alter table tb_order_item 
       add constraint FK4h5xid5qehset7qwe5l9c997x 
       foreign key (product_id) 
       references tb_product (id);

    alter table tb_order_item 
       add constraint FKgeobgl2xu916he8vhljktwxnx 
       foreign key (order_id) 
       references tb_order (id);

    alter table tb_order_item 
       add constraint FKdws5ywxm3rxgqxqkrifs1ai59 
       foreign key (unity_id) 
       references tb_unity (id);

    alter table tb_packaging 
       add constraint FK14n2rr8rsxpanlgebbxq8t7r7 
       foreign key (unity_id) 
       references tb_unity (id);

    alter table tb_packaging 
       add constraint FK4w6rojt5cqnfjk6otxidg19m3 
       foreign key (product_id) 
       references tb_product (id);

    alter table tb_product 
       add constraint FKi5b17771bifanjax4awtcu63i 
       foreign key (department_id) 
       references tb_department (id);

    alter table tb_product 
       add constraint FKh29i9kke6o4xvvacoib20i0qi 
       foreign key (section_id) 
       references tb_section (id);

    alter table tb_product 
       add constraint FKrcg0qwq5yq9um1x84h8u957m 
       foreign key (unity_id) 
       references tb_unity (id);

    alter table tb_quantity_discount 
       add constraint FKhj37jd8rf65gl0tk04m9s8njl 
       foreign key (product_id) 
       references tb_product (id);

    alter table tb_sales_authorization 
       add constraint FKiar3fsr9jauuht9pa879mtuqy 
       foreign key (client_id) 
       references tb_client (id);

    alter table tb_sales_authorization 
       add constraint FKiv7a0kyiyun3p73382gksgdvp 
       foreign key (product_id) 
       references tb_product (id);

    alter table tb_sales_authorization 
       add constraint FK63b8p5bn0u6qxvnpd8x1updw 
       foreign key (seller_id) 
       references tb_seller (id);

    alter table tb_user_role 
       add constraint FKea2ootw6b6bb0xt3ptl28bymv 
       foreign key (role_id) 
       references tb_role (id);

    alter table tb_user_role 
       add constraint FK7vn3h53d0tqdimm8cp45gc0kl 
       foreign key (user_id) 
       references tb_user (id);

INSERT INTO tb_user (NAME,login,PASSWORD) VALUES ('Diego Wandrofski Borges','diego@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (NAME,login,PASSWORD) VALUES ('Machado de Assis','machado@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (NAME,login,PASSWORD) VALUES ('José de Alencar','jose@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (NAME,login,PASSWORD) VALUES ('Monteiro Lobato','monteiro@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority,description) VALUES ('ROLE_MASTER','System Admin');
INSERT INTO tb_role (authority,description) VALUES ('ROLE_ADMIN','Company Admin');
INSERT INTO tb_role (authority,description) VALUES ('ROLE_SELLER','Seller');


INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 3);
