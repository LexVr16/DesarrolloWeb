package com.utp.alg.est.model.dao;

import com.utp.alg.est.model.Entrega;
import java.util.List;
import java.util.Map;

/**
 *
 * @author
 */
public interface EntregaDao extends EntidadDao<Entrega, Integer> {

    List<Map<String, String>> findAllEntregaPending();

    List<Map<String, String>> findAllEntregaComplete();
}
