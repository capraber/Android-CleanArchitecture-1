package com.globant.equattrocchio.domain;

import com.globant.equattrocchio.domain.enities.Image;
import com.globant.equattrocchio.domain.service.ImagesServices;

import java.util.List;

import io.reactivex.observers.DisposableObserver;

public class GetLatestImagesUseCase extends UseCase<List<Image>,Void> {

    private ImagesServices imagesServices;

    public GetLatestImagesUseCase(ImagesServices imagesServices) {
        super();
        this.imagesServices = imagesServices;
    }

    @Override
    void buildUseCaseObservable(DisposableObserver<List<Image>> observer, Void aVoid) {
        imagesServices.getLatestImages(observer);
    }
}
