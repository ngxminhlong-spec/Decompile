package m.i.n.Listener;

import android.content.Context;
import android.content.DialogInterface;
import m.i.n.i;

/* loaded from: classes2.dex */
public class UpdateIgnoreClickListener implements DialogInterface.OnClickListener {
    private final Context context;

    public UpdateIgnoreClickListener(Context context) {
        this.context = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i4) {
        i.updateIgnore(this.context);
        dialogInterface.dismiss();
    }
}
