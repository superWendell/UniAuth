package com.dianrong.common.uniauth.server.service.attribute.transalate;

import com.dianrong.common.uniauth.server.service.attribute.transalate.type.Email;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailTranslator extends AbstractAttributeTypeTranslator {

  @Override public Object doToRealType(String attribute) {
    return new Email(attribute);
  }

  @Override public Object toDatabaseType(String attribute) {
    Object obj = super.toDatabaseType(attribute);
    if (obj instanceof Email) {
      return ((Email) obj).getEmail();
    }
    return null;
  }
}
