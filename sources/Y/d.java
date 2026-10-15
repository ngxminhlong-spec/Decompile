package Y;

import H.Y;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TopicsManager topicsManager, int i4) {
        super(topicsManager);
        this.f2141b = i4;
    }

    @Override // Y.f
    public GetTopicsRequest a(a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        switch (this.f2141b) {
            case 1:
                S3.e.e(aVar, "request");
                adsSdkName = Y.e().setAdsSdkName("com.google.android.gms.ads");
                shouldRecordObservation = adsSdkName.setShouldRecordObservation(aVar.f2137a);
                build = shouldRecordObservation.build();
                S3.e.d(build, "Builder()\n            .s…ion)\n            .build()");
                return build;
            default:
                return super.a(aVar);
        }
    }
}
