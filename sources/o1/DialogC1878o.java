package o1;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.VideoView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import f.AbstractActivityC1671f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC1878o extends Dialog {

    /* renamed from: o, reason: collision with root package name */
    public AbstractActivityC1671f f14289o;

    /* renamed from: p, reason: collision with root package name */
    public int f14290p;

    /* renamed from: q, reason: collision with root package name */
    public VideoView f14291q;

    /* renamed from: r, reason: collision with root package name */
    public View f14292r;

    /* renamed from: s, reason: collision with root package name */
    public g2.x f14293s;

    /* JADX WARN: Type inference failed for: r0v0, types: [o1.o, android.app.Dialog, java.lang.Object] */
    public static DialogC1878o a(AbstractActivityC1671f abstractActivityC1671f, int i4) {
        ?? dialog = new Dialog(abstractActivityC1671f);
        dialog.f14293s = new g2.x(5, (Object) dialog);
        dialog.f14289o = abstractActivityC1671f;
        dialog.f14290p = i4;
        dialog.setContentView(R.layout.help_dialog_layout);
        return dialog;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i4;
        super.onCreate(bundle);
        int i5 = this.f14290p;
        int i6 = 0;
        switch (i5) {
            case 0:
                i4 = R.raw.help_scrollback;
                break;
            case 1:
                i4 = R.raw.help_single;
                break;
            case 2:
                i4 = R.raw.help_multi;
                break;
            case 3:
                i4 = R.raw.help_touch;
                break;
            case 4:
                i4 = R.raw.help_connect;
                break;
            case 5:
                i4 = R.raw.help_setup;
                break;
            case 6:
                i4 = R.raw.help_info;
                break;
            case 7:
                i4 = R.raw.help_timediagram;
                break;
            case 8:
                i4 = R.raw.help_start;
                break;
            default:
                i4 = 0;
                break;
        }
        String str = "android.resource://" + this.f14289o.getPackageName() + "/" + i4;
        this.f14292r = findViewById(R.id.help_dialog_seekbar);
        VideoView videoView = (VideoView) findViewById(R.id.help_dialog_video);
        this.f14291q = videoView;
        videoView.setVideoURI(Uri.parse(str));
        this.f14291q.setOnPreparedListener(new C1874m(this));
        this.f14291q.start();
        TextView textView = (TextView) findViewById(R.id.help_dialog_subtitle);
        switch (i5) {
            case 0:
                i6 = R.string.scroll_to_origin_help;
                break;
            case 1:
                i6 = R.string.single_select_mode;
                break;
            case 2:
                i6 = R.string.multi_select_mode;
                break;
            case 3:
                i6 = R.string.interact_mode;
                break;
            case 4:
                i6 = R.string.connect_mode;
                break;
            case 5:
                i6 = R.string.setup_help;
                break;
            case 6:
                i6 = R.string.info_help;
                break;
            case 7:
                i6 = R.string.timediagrma_help;
                break;
            case 8:
                i6 = R.string.start_help;
                break;
        }
        textView.setText(i6);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        findViewById(R.id.help_dialog_continue).setOnClickListener(new ViewOnClickListenerC1876n(this, 0));
        findViewById(R.id.help_dialog_don_show).setOnClickListener(new ViewOnClickListenerC1876n(this, 1));
    }
}
