create table languages
(
    id bigserial
        constraint languages_pkey
            primary key,
    name name unique not null
);

alter table languages owner to postgres;

create table keys
(
    id bigserial
        constraint keys_pkey
            primary key,
    name name not null
);

alter table keys owner to postgres;

create table translations
(
    id bigserial
        constraint translations_pkey
            primary key,
    key_id bigint not null,
    language_id bigint not null,
    value text
);

alter table translations
    add constraint fk_tra_key foreign key (key_id)
        references keys(id);

alter table translations
    add constraint fk_tra_lang foreign key (language_id)
        references languages(id);

alter table translations owner to postgres;


