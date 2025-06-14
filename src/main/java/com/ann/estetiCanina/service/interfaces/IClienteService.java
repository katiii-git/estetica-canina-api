package com.ann.estetiCanina.service.interfaces;

import com.ann.estetiCanina.dtos.response.ClienteResponse;
import com.ann.estetiCanina.dtos.request.ClienteRequest;
import java.util.List;

public interface IClienteService {
    ClienteResponse registrarCliente(ClienteRequest request);
    List<ClienteResponse> getAllClientes();

}
